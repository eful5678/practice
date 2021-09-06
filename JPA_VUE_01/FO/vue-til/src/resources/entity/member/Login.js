import BaseEntity from '@/resources/entity/global/BaseEntity';
export default class Login extends BaseEntity {
  constructor(result) {
    super();
    const _data = result || {};

    // id
    this.id = _data.id || '';
    this.name = _data.name || '';
    this.address = _data.address || {
      city: _data.city || '',
      street: _data.street || '',
      zipcode: _data.zipcode || '',
    };

    // 회원가입을 위한 변수
    this.username = _data.username || '';
    this.city = _data.city || '';
    this.street = _data.street || '';
    this.zipcode = _data.zipcode || '';
  }

  insert() {
    return {
      username: this.username,
      city: this.city,
      street: this.street,
      zipcode: this.zipcode,
    };
  }
}
