import { PhoneNumber } from './phone-number.model';

describe('PhoneNumber', () => {
  it('should create an instance', () => {
    expect(new PhoneNumber(0,'',false)).toBeTruthy();
  });
});
