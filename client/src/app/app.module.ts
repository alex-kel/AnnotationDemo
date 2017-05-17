import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { SelectionComponent } from './selection/selection.component';
import { TextComponent } from './text/text.component';
import { AnnotationComponent } from './annotation/annotation.component';
import {AnnotatedCaseService} from "./annotated-case.service";

@NgModule({
  declarations: [
    AppComponent,
    SelectionComponent,
    TextComponent,
    AnnotationComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [AnnotatedCaseService],
  bootstrap: [AppComponent]
})
export class AppModule { }
