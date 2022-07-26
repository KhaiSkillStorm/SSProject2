import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountBillingComponent } from './account-billing/account-billing.component';
import { AccountPageComponent } from './account-page/account-page.component';
import { AccountSettingsComponent } from './account-settings/account-settings.component';
import { AppComponent } from './app.component';
import { HomePageComponent } from './home-page/home-page.component';
import { LoginPageComponent } from './login-page/login-page.component';

const routes: Routes = [
  {
    path: '', redirectTo: 'home', pathMatch: 'full'
  },
  {
    path: 'home', component: HomePageComponent
  },
  {
    path: 'login', component: LoginPageComponent
  },
  {
    path: 'account', component: AccountPageComponent
  },
  {
    path: 'account/settings', component: AccountSettingsComponent
  },
  {
    path: 'account/billing', component: AccountBillingComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
