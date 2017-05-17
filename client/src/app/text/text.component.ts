import {Component, Input, OnInit} from '@angular/core';
import {AnnotatedCase} from '../annotated-case';

@Component({
  selector: 'app-text',
  templateUrl: './text.component.html',
  styleUrls: ['./text.component.css']
})
export class TextComponent implements OnInit {
  @Input() annotatedCase: AnnotatedCase;

  constructor() { }

  ngOnInit() {
  }
}
