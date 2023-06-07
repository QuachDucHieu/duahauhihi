import axios from 'axios';

const API_ENDPOINT = 'http://localhost:8080';

export class HomeServices {
  public async findAll() {
    try {
      const response = await axios.get(`${API_ENDPOINT}/api/home`);
      return response.data.data;
    } catch (error) {
      console.error(error);
      return [];
    }
  }
}

export default new HomeServices();