import "./NavBar.css";
import logo from "../../assets/imgs/logo_Menu.png"

const NavBar = () => {
  return (
    <div className="navbar">
      <div className="logo-container">
        <img src={logo} alt="logo" />
        <h1>
          <a href="/">MenuDigital</a>
        </h1>
      </div>
      <div className="navigation">
        <ul>
          <li>
            <a href="/NewProject">Login</a>
          </li>
        </ul>
      </div>
    </div>
  );
};

export default NavBar;