import { Component, OnInit } from '@angular/core';
import { GrouplistService } from './grouplist.service';
import {MatTableDataSource} from '@angular/material';
import { Group } from './group';

@Component({
  selector: 'app-grouplist',
  templateUrl: './grouplist.component.html',
  styleUrls: ['./grouplist.component.scss']
})
export class GrouplistComponent implements OnInit {

  
  public displayedColumns = ['groupname', 'groupdesc'];
  public dataSource = new MatTableDataSource<Group>();

  constructor(private ser: GrouplistService) { }

  ngOnInit() {
    this.getGroups();
  }
 
  getGroups() {
    this.ser.getGroups()
      .subscribe(res => {
        this.dataSource.data = res as Group[];
      })
  }


}
