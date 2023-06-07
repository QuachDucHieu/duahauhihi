import { Link } from 'react-router-dom';

const Home = () => {
    return(
        <div className="main">
            <div className="header">We love Snow</div>
            <div className="content">
                <Link to="/expenses">
                    <div className="box">
                        
                    </div>
                </Link>
            </div>
            <div className="footer"></div>
        </div>
    )
}

export default Home;