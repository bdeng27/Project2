import { Component, OnInit } from '@angular/core';
import { User } from '../models/models';
import { UserService } from '../user.service';

@Component({
    selector: 'user-cmp',
    moduleId: module.id,
    templateUrl: 'user.component.html'
})

export class UserComponent implements OnInit{
    
    user: User;

    constructor(private userService: UserService) { }

    ngOnInit(){
        this.getUser();
    }

    getUser(): void {
        this.userService.getUser().subscribe( user => this.user = user);
    }

}
