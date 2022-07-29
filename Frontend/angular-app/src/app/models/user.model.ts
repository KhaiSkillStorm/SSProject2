export class User {
    //think of everything in here as your class
    pk_id: number;
    username: string;
    hasplan01: boolean;
    hasplan02: boolean;
    hasplan03: boolean;

    constructor (pk_id: number, username: string, hasplan01: boolean, hasplan02: boolean, hasplan03: boolean) {
        this.pk_id = pk_id;
        this.username = username;
        this.hasplan01 = hasplan01;
        this.hasplan02 = hasplan02;
        this.hasplan03 = hasplan03;
    }
}
