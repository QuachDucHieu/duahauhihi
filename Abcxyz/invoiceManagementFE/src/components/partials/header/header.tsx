import React from 'react';
import { Link } from 'react-router-dom';
// import './Header.css';
// import logo from '../../../../';
// import userIcon from './user-icon.png';

const Header = () => {
  return (
    <header className="header">
      <div className="logo">
        {/* <img src={logo} alt="Logo" /> */}
        <span className="logo-text">QDH</span>
      </div>
      <div className="user">
        {/* <img src={userIcon} alt="User Icon" /> */}
      </div>
    </header>
  );
};

export default Header;
