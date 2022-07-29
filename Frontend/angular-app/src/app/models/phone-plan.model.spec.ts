import { PhonePlan } from './phone-plan.model';

describe('PhonePlan', () => {
  it('should create an instance', () => {
    expect(new PhonePlan(0,'',0,1)).toBeTruthy();
  });
});
