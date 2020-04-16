import { Component, OnInit } from '@angular/core';
import { HomeService } from './home.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  groups: any = [];
  constructor(private home: HomeService) { }

  getGroups() {
    this.home.getGroups()
      .subscribe(data => {
        for (const d of (data as any)) {
          this.groups.push({
            groupname: d.groupname,
            groupdesc: d.groupdesc
          });
        }
        console.log(this.groups);
      });
  }

  ngOnInit() {
  }

}
