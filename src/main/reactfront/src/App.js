import logo from './logo.svg';
import './App.css';
import {useEffect, useState} from 'react';

function App(){
  const [message, setMessage] = useState([]);

  //back과 통신하기 위해 useEffect에서 fetch 사용
  useEffect(() => {
    fetch("/hello")
      .then((res) => {
        return res.json();
      })
      .then((data)=>{
        setMessage(data);
      });
  }, []);

  return(
    <div>
        <div>시작</div>
        <ul>
            {message.map((text, index) => <li key={`${index}-${text}`}>{text}</li>)}
        </ul>
    </div>
  );
}

export default App;
