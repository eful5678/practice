import BaseEntity from '@/resources/entity/global/BaseEntity';
export default class Login extends BaseEntity {
  constructor(result) {
    super();
    const _data = result || {};
    this.bookName = _data.bookName || '';
  }
}
