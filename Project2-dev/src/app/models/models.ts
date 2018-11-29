export class User {
    userId: number;
    name: string;
    email: string;
    username: string;
    password: string;
    isManager: boolean;
    income: number;
}

export class BankAccount {
    accountId: number;
    amount: number;
    type: string;
    accountNumber: number;
    user: User;
}

export class Expense {
    expenseId: number;
    type: string;
    amount: number;
    date: string;
    location: string;
    user: User;
}