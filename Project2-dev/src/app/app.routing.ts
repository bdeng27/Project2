import { Routes, RouterModule } from '@angular/router';

import { DashboardComponent }   from './dashboard/dashboard.component';
import { UserComponent }   from './user/user.component';
import { TableComponent }   from './table/table.component';
import { BankaccountComponent }   from './bankaccount/bankaccount.component';
import { NewsComponent }   from './news/news.component';
import { MapsComponent }   from './maps/maps.component';
import { UpgradeComponent }   from './upgrade/upgrade.component';
import { LoginComponent } from './login/login.component';

export const appRoutes: Routes = [
    {
        path: '',
        redirectTo: 'login',
        pathMatch: 'full',
    },
    {
        path: 'dashboard',
        component: DashboardComponent
    },
    {
        path: 'user',
        component: UserComponent
    },
    {
    	path: 'bankaccount',
    	component: BankaccountComponent
    },
    {
        path: 'table',
        component: TableComponent
    },
    {
    	path: 'news',
    	component: NewsComponent
    },
    {
        path: 'maps',
        component: MapsComponent
    },
    {
        path: 'upgrade',
        component: UpgradeComponent
    },
    {
    	path: 'login',
    	component: LoginComponent
    },
    	
];

export const routing = RouterModule.forRoot(appRoutes);