import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

const localUrl = 'http://localhost:8080/group';

@Injectable({
  providedIn: 'root'
})
export class GrouplistService {

  constructor(private http: HttpClient) { }
  
  getGroups() {
    return this.http.get(localUrl);
  }
}
