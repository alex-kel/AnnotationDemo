import {Component, Input, OnInit} from '@angular/core';
import {AnnotatedCase} from '../annotated-case';
import {AnnotatedCaseService} from '../annotated-case.service';

@Component({
  selector: 'app-selection',
  templateUrl: './selection.component.html',
  styleUrls: ['./selection.component.css']
})
export class SelectionComponent implements OnInit {
  annotatedCase: AnnotatedCase;
  selectedValue: string;
  options: string[];

  constructor(private annotatedCaseService: AnnotatedCaseService) { }

  ngOnInit(): void {
    this.getDocumentNames();
  }

  getDocumentNames(): void {
    this.annotatedCaseService.getDocumentNames()
      .then(
        names => this.options = names
      );
  }

  onChange() {
    this.annotatedCaseService.getAnnotatedCaseByName(this.selectedValue)
      .then(annotatedCase => this.annotatedCase = annotatedCase);
  }
}
