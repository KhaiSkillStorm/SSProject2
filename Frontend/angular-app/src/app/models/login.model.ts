export class Login {
    //think of everything in here as your class
    idlogin: number;
    login: string;
    password: string;

    constructor (idlogin: number, login: string, password: string) {
        this.idlogin = idlogin;
        this.login = login;
        this.password = password;
    }
}