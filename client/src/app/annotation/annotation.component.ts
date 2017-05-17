import {Component, Input, OnInit} from '@angular/core';
import {AnnotatedCase, Annotation, Offset} from '../annotated-case';

@Component({
  selector: 'app-annotation',
  templateUrl: './annotation.component.html',
  styleUrls: ['./annotation.component.css']
})
export class AnnotationComponent implements OnInit {
  @Input() annotatedCase: AnnotatedCase;

  constructor() { }

  ngOnInit() { }

  // This approach works fine but fails on Regex creation in few cases, depending on annotation text
  // annotationClicked(id: String) {
  //   const annotatonText: string = this.annotatedCase.annotations
  //     .find(annotation => annotation.id === id)
  //     .text;
  //   const query = new RegExp('(\\b' + annotatonText + '\\b)', 'gim');
  //   const e: string = document.getElementById('casetext').innerHTML;
  //   const enew: string = e.replace(/(<span>|<\/span>)/igm, '');
  //   document.getElementById('casetext').innerHTML = enew;
  //   const newe: string = enew.replace(annotatonText, `<span>${annotatonText}</span>`);
  //   document.getElementById('casetext').innerHTML = newe;
  // }

  annotationClicked(id: String) {
    let text: string = this.annotatedCase.text;
    const annotation: Annotation = this.annotatedCase.annotations
      .find(ann => ann.id === id);
    text = text.replace(/<span>/g, '')
      .replace(/<\/span>/g, '');

    let currentShift = 0;
    for (const offset of annotation.offsets) {
      const start = offset.start + currentShift;
      text = [text.slice(0, start), '<span>', text.slice(start)].join('');
      currentShift += '<span>'.length;

      const end = offset.end + currentShift;
      text = [text.slice(0, end), '</span>', text.slice(end)].join('');
      currentShift += '</span>'.length;
    }

    this.annotatedCase.text = text;
  }
}
