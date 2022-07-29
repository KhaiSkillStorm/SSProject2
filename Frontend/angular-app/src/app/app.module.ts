import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { ErrorPageComponent } from './error-page/error-page.component';
import { AccountPageComponent } from './account-page/account-page.component';
import { AccountSettingsComponent } from './account-settings/account-settings.component';
import { AccountBillingComponent } from './account-billing/account-billing.component';
import { HomePageComponent } from './home-page/home-page.component';
import { NavigationHeaderComponent } from './navigation-header/navigation-header.component';
import { NavigationFooterComponent } from './navigation-footer/navigation-footer.component';
import { PhoneNumbersComponent } from './phone-numbers/phone-numbers.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    ErrorPageComponent,
    AccountPageComponent,
    AccountSettingsComponent,
    AccountBillingComponent,
    HomePageComponent,
    NavigationHeaderComponent,
    NavigationFooterComponent,
    PhoneNumbersComponent,
  ],
  imports: [BrowserModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
