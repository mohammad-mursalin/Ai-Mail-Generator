import { useState } from 'react'
import './App.css'
import ChatInput from './components/ChatInput'
import ChatResponse from './components/ChatResponse'
import { fetchChatResponse } from './services/api';

function App() {
  const [response, setResponse] = useState(null);
  const [question, setQuestion] = useState(""); // Store the question
  const [loading, setLoading] = useState(false);

  const handleQuestionSubmit = async (question) => {
    setQuestion(question); // Store the submitted question
    setLoading(true);
    setResponse(null);
    try {
      const apiResponse = await fetchChatResponse(question);
      setResponse(apiResponse);
    } catch (error) {
      alert("Failed to get response")
    } finally {
      setLoading(false);
    }
  }

  return (
    <div className='App'>
      <header className='bg-primary text-white text-center py-4'>
        <h1>Gemini ChatBot</h1>
      </header>
      <ChatInput onSubmit={handleQuestionSubmit}/>
      {loading && <h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Loading...</h3>}
      <ChatResponse response={response} question={question} /> {/* Pass question here */}
    </div>
  )
}

export default App;
