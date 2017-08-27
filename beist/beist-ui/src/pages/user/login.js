import React, { Component } from 'react';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/css/bootstrap-theme.css';
import LoginForm from '../../components/user/loginForm';

class Login extends Component {
    render() {
        return (
            <div className="padLef30Class padRig40Class padTop10Class padBot10Class">
                <LoginForm/>
            </div>
        );
    }
}

export default Login;