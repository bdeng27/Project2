import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { routing } from './app.routing';
import { SidebarModule } from './sidebar/sidebar.module';
import { FooterModule } from './shared/footer/footer.module';
import { NavbarModule} from './shared/navbar/navbar.module';
import { FixedPluginModule} from './shared/fixedplugin/fixedplugin.module';
import { NguiMapModule} from '@ngui/map';
import { HttpModule } from '@angular/http';

import { DashboardComponent }   from './dashboard/dashboard.component';
import { UserComponent }   from './user/user.component';
import { TableComponent }   from './table/table.component';
import { BankaccountComponent }   from './bankaccount/bankaccount.component';
import { NewsComponent }   from './news/news.component';
import { NewsService } from './news/news.service';
import { MapsComponent }   from './maps/maps.component';
import { UpgradeComponent }   from './upgrade/upgrade.component';

import { FormsModule }    from '@angular/forms';
import { LoginComponent } from './login/login.component';

import { UserService } from './user.service';
import { BankAccountService } from './bank-account.service'
import { ExpenseService } from './expense.service'

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    UserComponent,
    TableComponent,
    BankaccountComponent,
    NewsComponent,
    MapsComponent,
    UpgradeComponent,
    LoginComponent,
    NewsComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    routing,
    SidebarModule,
    FormsModule,
    NavbarModule,
    FooterModule,
    FixedPluginModule,
    HttpClientModule,
    NguiMapModule.forRoot({apiUrl: 'https://maps.google.com/maps/api/js?key=YOUR_KEY_HERE'})

  ],
  providers: [
    NewsService, 
    UserService, 
    BankAccountService,
    ExpenseService
  ],
  bootstrap: [AppComponent,NewsComponent]
})
export class AppModule { }

