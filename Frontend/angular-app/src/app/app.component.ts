import { Component } from '@angular/core';

@Component({
  selector: 'app-root', //what html tag gives me the component
  templateUrl: './app.component.html', //what html page to display
  styleUrls: ['./app.component.css'], //what stylesheets to look at
})
export class AppComponent {
  title = 'angular-app';
}
