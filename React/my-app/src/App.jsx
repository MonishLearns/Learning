import './App.css';
import StatusBar from './Customhook/Statusbar';
import Counter1 from './ErrorBoundaries/Counter1';
import Counter2 from './ErrorBoundaries/Counter2';
import ErrorBoundary from './ErrorBoundaries/ErrorBoundary';

function App() {
  return (
    <div className="App">
        {/* <ErrorBoundary fallback="error">
          <Counter1/>
        </ErrorBoundary>
        <ErrorBoundary fallback="error">
          <Counter2/>
        </ErrorBoundary> */}
        <ErrorBoundary>
            <StatusBar/> 
        </ErrorBoundary>
    </div>
  );
}

export default App;
