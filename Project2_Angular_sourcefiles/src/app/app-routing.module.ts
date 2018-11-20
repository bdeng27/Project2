import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardComponent} from './dashboard/dashboard.component'
import { UserInfoComponent } from './user-info/user-info.component';
import { ExpensesComponent } from './expenses/expenses.component';

const routes: Routes = [
  { path: 'home', component: DashboardComponent },
  { path: 'expenses', component: ExpensesComponent},
  { path: 'account', component: UserInfoComponent},
  { path: '', redirectTo: '/home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
