import React from 'react';
import { SafeAreaView, Text, TouchableHighlight } from 'react-native';

const LoginScreen = ({navigation}) => (
  <SafeAreaView>
    <TouchableHighlight onPress={() => navigation.navigate('Home')}>
      <Text>Login</Text>
    </TouchableHighlight>
  </SafeAreaView>
);

export default LoginScreen;
