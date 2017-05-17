import {Component, Input, OnInit, ViewEncapsulation} from '@angular/core';
import {AnnotatedCase} from '../annotated-case';

@Component({
  selector: 'app-text',
  templateUrl: './text.component.html',
  styleUrls: ['./text.component.css'],
  encapsulation: ViewEncapsulation.None,
})
export class TextComponent implements OnInit {
  @Input() annotatedCase: AnnotatedCase;

  constructor() { }

  ngOnInit() {
  }
}
