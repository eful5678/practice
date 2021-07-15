import axios from 'axios';

function createInstance() {}

// Axios 초기화
function createInstanceWithAuth() {
  const instance = axios.create({});
}

export const instance = createInstance();
export const posts = createInstanceWithAuth();
