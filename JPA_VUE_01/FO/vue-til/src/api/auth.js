import { instance } from './index';

function registerUser(userData) {
  // const url = 'http://localhost:3000/signup';
  // return axios.post(url, userData);

  return instance.post('/members/new', userData);
}

function searchUser() {
  return instance.get('/api/v2/members');
}

export { registerUser, searchUser };
