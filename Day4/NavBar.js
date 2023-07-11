import { Link } from 'react-router-dom';
import * as React from 'react';
import { useState } from 'react';
import {AppBar,Toolbar, Typography, Tabs,Tab, Button, IconButton} from '@mui/material/';
import HomeIcon from '@mui/icons-material/Home';

const Header = () => {
    const [val,setVal] = useState();
    return(
        <React.Fragment>
            <AppBar>
                <Toolbar sx={{backgroundColor: "#D50A29"}}>
                    <IconButton color="inherit" component="label"> <Link to='/' style={{textDecoration: 'none', color: 'white'}}><HomeIcon sx={{marginLeft: '20px'}} fontSize='large'/></Link></IconButton>
                
                    <Tabs textColor='inherit' indicatorColor='secondary' value={val} onChange = {(e,val) => setVal(val)}>
                        <Link to='/Parent' style={{textDecoration: 'none',color: 'white'}} ><Tab sx={{marginLeft: '10px'}} label="Parent" /></Link>
                        <Link to='/Child' style={{textDecoration: 'none',color: 'white'}} ><Tab sx={{marginLeft: '1px'}} label="Child" /></Link>
                    </Tabs>
                    <Typography sx={{marginLeft: 'auto', fontSize: '20px'}}>
                        MYAPP
                    </Typography>
                    <Button sx={{marginLeft: 'auto' , background: "#ffffff", color: "#000"}} variant="contained">Login</Button>
                    <Button sx={{marginLeft: '20px' , background: "#ffffff", color: "#000"}} variant="contained">SignUp</Button>
                </Toolbar>
            </AppBar>
        </React.Fragment>
    )
}

export default Header;