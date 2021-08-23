import { SerUserService } from './../ser-user.service';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  constructor(private addUserSer: SerUserService) { }

  ngOnInit(): void {

  }
  addUser(formu:NgForm){
    this.addUserSer.addUser(formu)
  }
}
