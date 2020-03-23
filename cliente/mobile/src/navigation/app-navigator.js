import {createBottomTabNavigator} from 'react-navigation-tabs';

import SelectionScreen from '../scenes/selection';
import TurnScreen from '../scenes/turn';
import ConfigScreen from '../scenes/config';

const TabNavigatorConfig = {
  initialRouteName: 'Home',
  header: null,
  headerMode: 'none',
};

const RouteConfigs = {
  Home: {
    screen: SelectionScreen,
  },
  Turn: {
    screen: TurnScreen,
  },
  Config: {
    screen: ConfigScreen,
  }
};

const AppNavigator = createBottomTabNavigator(RouteConfigs, TabNavigatorConfig);

export default AppNavigator;
