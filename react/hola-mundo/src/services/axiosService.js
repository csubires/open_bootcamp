import APIRequest from '../config/axios.config';


export function getChucknorris() {
    return APIRequest.get('/', {
        validateStatus: function (status) {
            return status < 500;
        }
    });
}

