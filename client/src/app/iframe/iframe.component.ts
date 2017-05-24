import { Component, OnInit } from '@angular/core';
import {AnnotatedCaseService} from '../annotated-case.service';
import {ActivatedRoute, Params, Router} from '@angular/router';
import {AnnotatedCase} from '../annotated-case';
import 'rxjs/add/operator/switchMap';


@Component({
  selector: 'app-iframe',
  templateUrl: './iframe.component.html',
  styleUrls: ['./iframe.component.css']
})
export class IframeComponent implements OnInit {

  private annotatedCase: AnnotatedCase;

  constructor(private route: ActivatedRoute,
              private router: Router,
              private service: AnnotatedCaseService) { }

  ngOnInit() {
    this.route.params
      .switchMap((params: Params) => this.service.getAnnotatedCaseByName(params['id']))
      .subscribe((annotatedCase: AnnotatedCase) => this.annotatedCase = annotatedCase);
  }
}
