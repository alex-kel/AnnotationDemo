import {Injectable} from '@angular/core';
import {Http} from '@angular/http';

import 'rxjs/add/operator/toPromise';
import {AnnotatedCase} from './annotated-case';

/**
 * Created by kelale on 5/17/2017.
 */

@Injectable()
export class AnnotatedCaseService {
  private apiUrl = 'api/annotated';

  constructor(private http: Http) { }

  getDocumentNames(): Promise<string[]> {
    return this.http.get(this.apiUrl)
      .toPromise()
      .then(response => response.json())
      .catch(this.handleError);
  }

  getAnnotatedCaseByName(name: string): Promise<AnnotatedCase> {
    const url = `${this.apiUrl}/${name}`;
    return this.http.get(url)
      .toPromise()
      .then( response => {
        return response.json() as AnnotatedCase;
      })
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error);
    return Promise.reject(error.message || error);
  }
}
