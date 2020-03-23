import React from 'react';
import { SafeAreaView, Text, TouchableHighlight, StyleSheet } from 'react-native';

const ConfigScreen = ({navigation}) => (
  <SafeAreaView style={ styles.MainContainer }>
    <Text style={ styles.button }>[ Settings ]</Text>
    <TouchableHighlight onPress={() => navigation.navigate('Home')}>
      <Text style={ styles.button }>Cancel</Text>
    </TouchableHighlight>
  </SafeAreaView>
);

const styles = StyleSheet.create({
 
	MainContainer: {
		// Setting up View inside component in Vertically center.
		justifyContent: 'center',
		// Setting up View inside component align horizontally center.
		alignItems: 'center',
		flex: 1
	},

	button: {
		textAlign: 'center',
		fontSize: 30,
    fontWeight: 'bold',
		margin: 10,
		width: 300,
		height: 50,
		backgroundColor: 'powderblue'
 	}

});

export default ConfigScreen;
