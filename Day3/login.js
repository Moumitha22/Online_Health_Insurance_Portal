import React, { useState } from "react";
import "./login.css";
import { Link } from "react-router-dom";


function Login() {
    const [id, setId] = useState("");
    const [pass, setPass] = useState("");


    return (
        <form>       
            <div className="content">
                <div><h1>Log In</h1></div>
                <div className="userName">
                    <label >Email ID</label>
                    <input required
                        type='email'
                        value={id}
                        onChange={(e) => setId(e.target.value)}
                    />
                </div>
               
                <div className="password">
                    <label>Password</label>
                    <input 
                    required
                        type="password"
                        pattern="^(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*]).{8,}$"
                        value={pass}
                        onChange={(e) => setPass(e.target.value)}
                    />
                </div>
             
                <div id="submit">                
                    <button type='submit'><Link to='/' style={{textDecoration: 'none'}}>Log In</Link></button>                   
                </div>
                <div id="new">
                    Don't have an account? 
                    <Link to='/signup'>Signup</Link>
                </div>
            </div>
        
        </form>
    );
}
export default Login;