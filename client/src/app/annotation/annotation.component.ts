import {Component, Input, OnInit} from '@angular/core';
import {AnnotatedCase} from '../annotated-case';

@Component({
  selector: 'app-annotation',
  templateUrl: './annotation.component.html',
  styleUrls: ['./annotation.component.css']
})
export class AnnotationComponent implements OnInit {
  @Input() annotatedCase: AnnotatedCase;

  constructor() { }

  ngOnInit() { }

  annotationClicked(id: String) {
    const annotatonText: string = this.annotatedCase.annotations
      .find(annotation => annotation.id === id)
      .text;
    const query = new RegExp('(\\b' + annotatonText + '\\b)', 'gim');
    const e: string = document.getElementById('casetext').innerHTML;
    const enew: string = e.replace(/(<span>|<\/span>)/igm, '');
    document.getElementById('casetext').innerHTML = enew;
    const newe: string = enew.replace(annotatonText, `<span>${annotatonText}</span>`);
    console.log(newe);
    document.getElementById('casetext').innerHTML = newe;
  }
}
