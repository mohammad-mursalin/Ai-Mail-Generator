const ChatResponse = ({ response, question }) => {
  if (!response) {
    return null;
  }

  return (
    <div className="container my-4">
      <h3>Response</h3>

      <div className="card mb-3">
        <div className="card-body">
          <h5 className="card-title">{question}</h5>

          <p className="card-text">{response}</p>
        </div>
      </div>
    </div>
  )
}

export default ChatResponse;
