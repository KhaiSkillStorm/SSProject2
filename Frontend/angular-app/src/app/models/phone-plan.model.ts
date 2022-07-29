export class PhonePlan {
    //think of everything in here as your class
    planId: number;
    name: string;
    price: number;
    deviceLimit: number;

    constructor (planId: number, name: string, price: number, deviceLimit: number) {
        this.planId = planId;
        this.name = name;
        this.price = price;
        this.deviceLimit = deviceLimit;
    }
}
