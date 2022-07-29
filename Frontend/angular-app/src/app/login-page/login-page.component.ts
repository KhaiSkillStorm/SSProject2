import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
//import { User } from '../../../../../Backend/backend/src/main/java/com/ssproject2/data';
//import { OwnerService } from '../services/owner-service.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css'],
})
export class LoginPageComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {
  }


  submit(): void{}
    /*
    if (this.userLogin.uname.trim() != "" && this.newOwner.age >= 0) {
      //send the forms values
      this.ownerService.save(this.newOwner).subscribe(data => {
        let route = this.router.config.find(r => r.path === 'owners');
        if (route) {
          this.router.navigateByUrl('/owners');
        }
      });
    }
  }
*/
}
