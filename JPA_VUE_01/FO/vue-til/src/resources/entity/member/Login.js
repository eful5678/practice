import BaseEntity from '@/resources/entity/global/BaseEntity';
export default class Login extends BaseEntity {
  constructor(result) {
    super();
    const _data = result || {};
    this.username = _data.username || '';

    // 회원가입을 위한 변수
    this.city = _data.city || '';
    this.street = _data.street || '';
    this.zipcode = _data.zipcode || '';
  }
}
