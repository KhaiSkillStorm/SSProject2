import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-plan',
  templateUrl: './plan-page.component.html',
  styleUrls: ['./plan-page.component.css'],
})
export class PlanPageComponent implements OnInit {
  @Input() plan: any;

  constructor() {}

  ngOnInit(): void {}
}
