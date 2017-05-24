import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { SelectionComponent } from './selection/selection.component';
import { TextComponent } from './text/text.component';
import { AnnotationComponent } from './annotation/annotation.component';
import {AnnotatedCaseService} from "./annotated-case.service";
import {Route, RouterModule} from "@angular/router";
import { IframeComponent } from './iframe/iframe.component';

const routes: Route[] = [
  {path: '', component: SelectionComponent},
  {path: 'cases/:id', component: IframeComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    SelectionComponent,
    TextComponent,
    AnnotationComponent,
    IframeComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(routes)
  ],
  providers: [AnnotatedCaseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
