import React, { useState } from "react";
import '../Components/signup.css';
import { Link } from "react-router-dom";

function Signup() {
    const [id, setId] = useState("");
    const[name,setName]=useState("");
    const[email,setEmail]=useState("");
    const[newpass,setNewpass]=useState("");
    const [confpass,setConfpass] = useState("");

    return (
         <form className="sign">
            <div className="content">
                <div><h1>Signup</h1></div>
                      
                <div className="password">
                    <label>Name</label>
                    <input
                        required
                        type="text"
                        value={name}
                        onChange={(e) => setName(e.target.value)}
                    />
                </div>
             
                <div className="password">
                    <label>Email</label>
                    <input
                        type="email"
                        value={email}
                        onChange={(e) => setEmail(e.target.value)}
                        required
                    />
                </div>
           
                <div className="password">
                    <label >Password</label>
                    <input
                        type="password"
                        value={newpass}
                        pattern="^(?=.*\d)(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*]).{8,}$"
                        onChange={(e) => setNewpass(e.target.value)}
                        required
                    />
                </div>
              
                <div className="password">
                    <label>Phone Number</label>
                    <input
                        type="text"
                        value={confpass}
                        pattern="[1-9]{1}[0-9]{9}"
                        onChange={(e) => setConfpass(e.target.value)}
                        required
                    />
                </div>
                <div id="submit">
                <button><Link to='/login' style={{textDecoration: 'none'}}>Sign Up</Link></button>
                </div>
                <div id="new">
                    Already have an account?<Link to='/login' style={{textDecoration: 'none'}}>Login</Link>
                </div>
            </div>
        </form>
    ); 
}
export default Signup;