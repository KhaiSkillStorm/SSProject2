export class PhoneNumber {
    //think of everything in here as your class
      phoneId: number;
      phone_num: string;
      isAssigned: boolean;
  
      constructor (phoneId: number, phone_num: string, isAssigned: boolean) {
          this.phoneId = phoneId;
          this.phone_num = phone_num;
          this.isAssigned = isAssigned;
      }
}
