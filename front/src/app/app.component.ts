import { User } from './../../../Neopolis/src/app/User';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Neo';
  user: User = new User()

  addUser(){
    console.log(this.user.nom);

  }
}
