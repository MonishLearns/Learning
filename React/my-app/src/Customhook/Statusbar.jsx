import useOnlineCustomHook from "./customHook";

export default function StatusBar() {
  const isOnline = useOnlineCustomHook();
  return <h1>{isOnline ? '✅ Online' : '❌ Disconnected'}</h1>;
}
