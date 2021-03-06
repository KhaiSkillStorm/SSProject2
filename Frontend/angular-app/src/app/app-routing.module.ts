import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountBillingComponent } from './account-billing/account-billing.component';
import { AccountPageComponent } from './account-page/account-page.component';
import { AccountSettingsComponent } from './account-settings/account-settings.component';
import { AppComponent } from './app.component';
import { DeviceComponent } from './device/device.component';
import { ErrorPageComponent } from './error-page/error-page.component';
import { HomePageComponent } from './home-page/home-page.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { PhoneNumbersComponent } from './phone-numbers/phone-numbers.component';
import { PlanPageComponent } from './plan-page/plan-page.component';
const routes: Routes = [
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
  },
  {
    path: 'home',
    component: HomePageComponent,
  },
  {
    path: 'login',
    component: LoginPageComponent,
  },
  {
    path: 'account',
    component: AccountPageComponent,
  },
  {
    path: 'account/settings',
    component: AccountSettingsComponent,
  },
  {
    path: 'account/billing',
    component: AccountBillingComponent,
  },
  {
    path: 'plans',
    component: PlanPageComponent,
  },
  {
    path: 'devices',
    component: DeviceComponent,
  },
  {
    path: 'phoneNumbers',
    component: PhoneNumbersComponent,
  },
  //Wild Card Route for 404 request
  {
    path: '**',
    pathMatch: 'full',
    component: ErrorPageComponent,
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
