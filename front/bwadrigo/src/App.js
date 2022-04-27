import Home from "./components/Home";
import { Route, Routes } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";

import MemberPlan from "./components/usePlan/MemberPlan";
import StartTermination from "./components/usePlan/StartTermination";
import SurveyTermination from "./components/usePlan/SurveyTermination";
import FinishTermination from "./components/usePlan/FinishTermination";

import Application from './components/collection/Application';
import ApplicationDetail from './components/collection/ApplicationDetail';
import ApplicationInfo from './components/collection/ApplicationInfo';
import ApplicationResult from './components/collection/ApplicationResult';

function App() {
  return (
    <div className="App">
      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/member-plan" element={<MemberPlan />} />
        <Route path="/start-termination" element={<StartTermination />} />
        <Route path="/survey-termination" element={<SurveyTermination />} />
        <Route path="/finish-termination" element={<FinishTermination />} />

        <Route path="/application" element={<Application/>} />
        <Route path="/applicationInfo" element={<ApplicationInfo/>} />
        <Route path="/applicationDetail" element={<ApplicationDetail/>} />
        <Route path="/applicationResult" element={<ApplicationResult/>} />
      </Routes>
    </div>
  );
}

export default App;
