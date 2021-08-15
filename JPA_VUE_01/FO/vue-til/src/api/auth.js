import { instance } from './index';

function registerUser(userData) {
  // const url = 'http://localhost:3000/signup';
  // return axios.post(url, userData);

  return instance.post('/members/new', userData);
}

function searchUser() {
  return instance.get('/members/list');
}

export { registerUser, searchUser };
