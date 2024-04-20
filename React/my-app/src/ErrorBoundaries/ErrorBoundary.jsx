import React from "react";

// Error boundary should always be in class component because of the function getDerivedStateFromError
// This getDerivedStateFromError will always sety the state hasError to true, when one of the child component breaks


class ErrorBoundary extends React.Component {
    constructor(props) {
        super(props);
        this.state = { hasError: false, errorInfo: null };
      }

    componentDidCatch(error, info) {
        console.log(this.state.hasError);
        this.setState({
            hasError: true,
            errorInfo: info,
        })
    }

    render() {
        console.log(this.state.hasError);
        if(this.state.hasError){
            return this.props.fallback
        }
        return this.props.children;
    }
}

export default ErrorBoundary;